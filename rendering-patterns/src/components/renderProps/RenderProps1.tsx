type ChildProps = {
  render: (name: string) => JSX.Element;
}

export const ChildComponent: React.FC<ChildProps> = ({ render }) => {
  const name = 'Ivan Ortega'
  return (
    <div>
      {render(name)}
    </div>
  )
}

export const ParentComponent = () => {
  return (
    <>
      <ChildComponent render={(name) => <p>Hello, !{name}</p>} />
    </>
  )
}