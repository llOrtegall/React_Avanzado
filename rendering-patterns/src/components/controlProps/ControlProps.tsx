import { FC, useState } from "react";

type ToggleProps = {
  isToggle?: boolean;
  onToggle?: (value: boolean) => void;
}

const Toggle: FC<ToggleProps> = ({ isToggle = false, onToggle }) => {
  const [internalToggle, setInternalToggle] = useState(isToggle);

  const handleToggle = () => {
    const newValue = !internalToggle;
    setInternalToggle(newValue);

    if(onToggle){
      onToggle(newValue);
    }
  }

  return (
    <button onClick={handleToggle} style={{ background: '#415', borderRadius: '20px' }}>
      {internalToggle ? 'ON' : 'OFF'}
    </button>
  )
}

export const ParentComponent = () => {
  const [toogleState, setToggleState] = useState(false);

  return (
    <div>
      <p>Togle is {toogleState ? 'ON' : 'OFF'}</p>
      <Toggle isToggle={toogleState} onToggle={setToggleState} />
    </div>
  )
}